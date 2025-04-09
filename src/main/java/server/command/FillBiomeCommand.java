package yarnwrap.server.command;
public class FillBiomeCommand { public net.minecraft.server.command.FillBiomeCommand wrapperContained; public FillBiomeCommand(net.minecraft.server.command.FillBiomeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNLOADED_EXCEPTION() { return wrapperContained.UNLOADED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TOO_BIG_EXCEPTION() { return wrapperContained.TOO_BIG_EXCEPTION; }
// public int convertCoordinate(int coordinate) { return wrapperContained.convertCoordinate(coordinate); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public yarnwrap.world.biome.source.BiomeSupplier createBiomeSupplier(org.apache.commons.lang3.mutable.MutableInt counter,yarnwrap.world.chunk.Chunk chunk,yarnwrap.util.math.BlockBox box,yarnwrap.registry.entry.RegistryEntry biome,java.util.function.Predicate filter) { return new yarnwrap.world.biome.source.BiomeSupplier(wrapperContained.createBiomeSupplier(counter,chunk.wrapperContained,box.wrapperContained,biome.wrapperContained,filter)); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,Object biome,java.util.function.Predicate filter) { return wrapperContained.execute(source.wrapperContained,from.wrapperContained,to.wrapperContained,biome,filter); }
// public yarnwrap.util.math.BlockPos convertPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.convertPos(pos.wrapperContained)); }
public com.mojang.datafixers.util.Either fillBiome(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,yarnwrap.registry.entry.RegistryEntry biome) { return wrapperContained.fillBiome(world.wrapperContained,from.wrapperContained,to.wrapperContained,biome.wrapperContained); }
public com.mojang.datafixers.util.Either fillBiome(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos from,yarnwrap.util.math.BlockPos to,yarnwrap.registry.entry.RegistryEntry biome,java.util.function.Predicate filter,java.util.function.Consumer feedbackConsumer) { return wrapperContained.fillBiome(world.wrapperContained,from.wrapperContained,to.wrapperContained,biome.wrapperContained,filter,feedbackConsumer); }

}