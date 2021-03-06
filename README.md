# WaspberryWebsocketManagement
Submodule for maintaining websocket to waspberry

### How to use:
1. Create a **WaspberryWebsocketComponent**
    ```
        WaspberryWebsocketComponent waspberryWebsocketComponent = DaggerWaspberryWebsocketComponent.builder()
               .unsatisfiedWebsocketDependenciesModule(new UnsatisfiedWebsocketDependenciesModule(
                    uri,                // URI to connect
                    connectionTimeout,  // Duration to wait before reconnecting
                    messageModelList,   // List of MessageModel's that are supported
                    messageHandlerList  // List of MessageHandlers of MessageModel
                    ))
               .build();
    ```
    
2. Get **WaspberrySocketManager** and **WaspberryMessageHandler** instance from the component
    ```
       WaspberrySocketManager socketManager = waspberryWebsocketComponent.getWaspberrySocketManager();
       WaspberryMessageHandler messageHandler = waspberryWebsocketComponent.getWaspberryMessageHandler();
    ```