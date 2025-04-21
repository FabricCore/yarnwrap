# Yarnwrap - A FabricMC Wrapper

[**Docs**](https://fabriccore.github.io/yarnwrap/) | [**Generator (Wrapper)**](https://github.com/FabricCore/yarn-wrapper-gen) | [**Generator (Events)**](https://github.com/FabricCore/fabric_event_mappers)

Yarnwrap allows Java classes from Minecraft to be referenced by their actual name, which is previously not possible due to Minecraft obfuscation.

Yarnwrap contains

- Wrapper classes for each Java class from Minecraft ([see docs](https://fabriccore.github.io/yarnwrap/)).
- Listener for all [Fabric API events](https://wiki.fabricmc.net/tutorial:event_index).

| Version | Download                                                                                            |
| ------- | --------------------------------------------------------------------------------------------------- |
| 1.21.1  | [1.21.1b2](https://github.com/FabricCore/yarnwrap/releases/download/1.21.1b2/yarnwrap-1_21_1b2.jar) |

> I would appreciate if you give this project a star :)

## Usage

Yarnwrap is a library mod, **put it in the mods folder**, Fabric API required.

### Class Conversion

To create a wrapper class of corresponding type.

```java
net.minecarft.name.of.Type original = someFunction();
yarnwrap.name.of.Type wrapped = new yarnwrap.name.of.Type(original);
```

To unwrap a class.

```java
yarnwrap.name.of.Type wrapped = someOtherFunction();
net.minecarft.name.of.Type = wrapped.wrapperContained;
```

### Event Listeners (Runnables)

**yarnwrap.Core** implements the functional interfaces to be used as a listener to Fabric API events.

```java
yarnwrap.Core runnable = Core.runnable.create("label", "function f() { ... }");
ClientTickEvents.START_CLIENT_TICK.register(runnable);
```

<img src="./src/main/resources/assets/template/icon.png" width=50px>
