package yarnwrap.data.server.tag.vanilla;
public class VanillaGameEventTagProvider { public net.minecraft.data.server.tag.vanilla.VanillaGameEventTagProvider wrapperContained; public VanillaGameEventTagProvider(net.minecraft.data.server.tag.vanilla.VanillaGameEventTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List BASIC_GAME_EVENTS() { return wrapperContained.BASIC_GAME_EVENTS; }
// public void BASIC_GAME_EVENTS(java.util.List value) { wrapperContained.BASIC_GAME_EVENTS = value; }
// public static java.util.List BASIC_GAME_EVENTS() { return net.minecraft.data.server.tag.vanilla.VanillaGameEventTagProvider.BASIC_GAME_EVENTS; }
// public static void BASIC_GAME_EVENTS(java.util.List value, ) { net.minecraft.data.server.tag.vanilla.VanillaGameEventTagProvider.BASIC_GAME_EVENTS = value; }

public VanillaGameEventTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.vanilla.VanillaGameEventTagProvider(output.wrapperContained,registryLookupFuture); }

}