package com.podding.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

public class BaseCommand {
    private Map<String, Method> commandMap = null;

    public BaseCommand(){
        this.commandMap = new HashMap<String, Method>();
        for(Method m : this.getClass().getDeclaredMethods()) {
            CommandArgs anno = (CommandArgs)m.getAnnotation(CommandArgs.class);
            if(anno != null){
                this.commandMap.put(anno.args(), m);
            }
        }
    }

    public boolean invoke(String[] args, Player p) throws Exception{
        if(args.length == 0){
            empty(p);
            return true;
        }

        String cmd = args[0];
        Method m = this.commandMap.get(cmd);

        if(m == null){
            return false;
        }

        m.invoke(this, p);
        return true;
    }

    void empty(Player p){  }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface CommandArgs {
        String args();
    }
}
