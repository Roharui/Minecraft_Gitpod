# Minecraft_Gitpod

Frame work to develop minecraft plugin at GitPod

# How to Build

```
├── Server
│   ├── run.sh
│   ├── <spigot-bukkit.jar> # <- you have to install it.
└── ngrok
    ├── run.sh
    └── <ngrok> # <- you have to install it.
```

1. install Spigot.jar inside `/Server`. and install ngrok inside `/ngrok`.

2. run two .sh files each console.

3. go Pod and execute `mvn install`

4. it automaticly create plugin inside `/Server/plugin`

5. reload minecraft Server.

6. connect minecraft with url provide by `ngrok`.