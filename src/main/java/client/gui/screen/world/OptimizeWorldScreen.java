package yarnwrap.client.gui.screen.world;
public class OptimizeWorldScreen { public net.minecraft.client.gui.screen.world.OptimizeWorldScreen wrapperContained; public OptimizeWorldScreen(net.minecraft.client.gui.screen.world.OptimizeWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.function.ToIntFunction DIMENSION_COLORS() { return wrapperContained.DIMENSION_COLORS; }
// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public yarnwrap.world.updater.WorldUpdater updater() { return new yarnwrap.world.updater.WorldUpdater(wrapperContained.updater); }
// public yarnwrap.client.gui.screen.world.OptimizeWorldScreen create(yarnwrap.client.MinecraftClient client,it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,com.mojang.datafixers.DataFixer dataFixer,Object storageSession,boolean eraseCache) { return new yarnwrap.client.gui.screen.world.OptimizeWorldScreen(wrapperContained.create(client.wrapperContained,callback,dataFixer,storageSession,eraseCache)); }

}