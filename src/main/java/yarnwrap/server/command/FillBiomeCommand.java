package yarnwrap.server.command;
public class FillBiomeCommand { public net.minecraft.server.command.FillBiomeCommand wrapperContained; public FillBiomeCommand(net.minecraft.server.command.FillBiomeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNLOADED_EXCEPTION() { return wrapperContained.UNLOADED_EXCEPTION; }
// public void UNLOADED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNLOADED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public void TOO_BIG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TOO_BIG_EXCEPTION = value; }
// public int convertCoordinate(int coordinate) { return wrapperContained.convertCoordinate(coordinate); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int method_47530(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_47530(context); }
// public yarnwrap.world.biome.source.BiomeSupplier createBiomeSupplier(org.apache.commons.lang3.mutable.MutableInt counter,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockBox box,yarnwrap.registry.entry.RegistryEntry biome,java.util.function.Predicate filter) { return new yarnwrap.world.biome.source.BiomeSupplier(wrapperContained.createBiomeSupplier(counter,chunk.wrapperContained,box.wrapperContained,biome.wrapperContained,filter)); }
// public boolean method_47532(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_47532(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,Object biome,java.util.function.Predicate filter) { return wrapperContained.execute(source.wrapperContained,from.wrapperContained,to.wrapperContained,biome,filter); }
// public yarnwrap.registry.entry.RegistryEntry method_47534(yarnwrap.world.chunk.Chunk x,yarnwrap.util.math.BlockBox y,java.util.function.Predicate z,org.apache.commons.lang3.mutable.MutableInt noise) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_47534(x.wrapperContained,y.wrapperContained,z,noise)); }
// public yarnwrap.util.math.BlockPos convertPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.convertPos(pos.wrapperContained)); }
// public com.mojang.brigadier.Message method_47536(java.lang.Object maximum,java.lang.Object specified) { return wrapperContained.method_47536(maximum,specified); }
// public int method_47818(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_47818(context); }
public com.mojang.datafixers.util.Either fillBiome(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,yarnwrap.registry.entry.RegistryEntry biome) { return wrapperContained.fillBiome(world.wrapperContained,from.wrapperContained,to.wrapperContained,biome.wrapperContained); }
public com.mojang.datafixers.util.Either fillBiome(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,yarnwrap.registry.entry.RegistryEntry biome,java.util.function.Predicate filter,java.util.function.Consumer feedbackConsumer) { return wrapperContained.fillBiome(world.wrapperContained,from.wrapperContained,to.wrapperContained,biome.wrapperContained,filter,feedbackConsumer); }
// public void method_55341(yarnwrap.server.command.ServerCommandSource feedbackSupplier) { wrapperContained.method_55341(feedbackSupplier.wrapperContained); }
// public boolean method_55342(yarnwrap.registry.entry.RegistryEntry biomex) { return wrapperContained.method_55342(biomex.wrapperContained); }
// public void method_55343(java.util.function.Supplier feedbackSupplier) { wrapperContained.method_55343(feedbackSupplier); }

}