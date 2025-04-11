package yarnwrap.server.command;
public class PlaceCommand { public net.minecraft.server.command.PlaceCommand wrapperContained; public PlaceCommand(net.minecraft.server.command.PlaceCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FEATURE_FAILED_EXCEPTION() { return wrapperContained.FEATURE_FAILED_EXCEPTION; }
// public void FEATURE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FEATURE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType JIGSAW_FAILED_EXCEPTION() { return wrapperContained.JIGSAW_FAILED_EXCEPTION; }
// public void JIGSAW_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.JIGSAW_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType STRUCTURE_FAILED_EXCEPTION() { return wrapperContained.STRUCTURE_FAILED_EXCEPTION; }
// public void STRUCTURE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.STRUCTURE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType TEMPLATE_INVALID_EXCEPTION() { return wrapperContained.TEMPLATE_INVALID_EXCEPTION; }
// public void TEMPLATE_INVALID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.TEMPLATE_INVALID_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TEMPLATE_FAILED_EXCEPTION() { return wrapperContained.TEMPLATE_FAILED_EXCEPTION; }
// public void TEMPLATE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TEMPLATE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executePlaceFeature(yarnwrap.server.command.ServerCommandSource source,Object feature,yarnwrap.util.math.BlockPos pos) { return wrapperContained.executePlaceFeature(source.wrapperContained,feature,pos.wrapperContained); }
// public void throwOnUnloadedPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.ChunkPos pos1,yarnwrap.util.math.ChunkPos pos2) { wrapperContained.throwOnUnloadedPos(world.wrapperContained,pos1.wrapperContained,pos2.wrapperContained); }
// public int executePlaceJigsaw(yarnwrap.server.command.ServerCommandSource source,yarnwrap.registry.entry.RegistryEntry structurePool,yarnwrap.util.Identifier id,int maxDepth,yarnwrap.util.math.BlockPos pos) { return wrapperContained.executePlaceJigsaw(source.wrapperContained,structurePool.wrapperContained,id.wrapperContained,maxDepth,pos.wrapperContained); }
// public int executePlaceStructure(yarnwrap.server.command.ServerCommandSource source,Object structure,yarnwrap.util.math.BlockPos pos) { return wrapperContained.executePlaceStructure(source.wrapperContained,structure,pos.wrapperContained); }
// public int executePlaceTemplate(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier id,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,yarnwrap.util.BlockMirror mirror,float integrity,int seed) { return wrapperContained.executePlaceTemplate(source.wrapperContained,id.wrapperContained,pos.wrapperContained,rotation.wrapperContained,mirror.wrapperContained,integrity,seed); }

}