package yarnwrap.server.command;
public class LocateCommand { public net.minecraft.server.command.LocateCommand wrapperContained; public LocateCommand(net.minecraft.server.command.LocateCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType STRUCTURE_NOT_FOUND_EXCEPTION() { return wrapperContained.STRUCTURE_NOT_FOUND_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType STRUCTURE_INVALID_EXCEPTION() { return wrapperContained.STRUCTURE_INVALID_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType BIOME_NOT_FOUND_EXCEPTION() { return wrapperContained.BIOME_NOT_FOUND_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType POI_NOT_FOUND_EXCEPTION() { return wrapperContained.POI_NOT_FOUND_EXCEPTION; }
// public int LOCATE_STRUCTURE_RADIUS() { return wrapperContained.LOCATE_STRUCTURE_RADIUS; }
// public int LOCATE_BIOME_RADIUS() { return wrapperContained.LOCATE_BIOME_RADIUS; }
// public int LOCATE_BIOME_HORIZONTAL_BLOCK_CHECK_INTERVAL() { return wrapperContained.LOCATE_BIOME_HORIZONTAL_BLOCK_CHECK_INTERVAL; }
// public int LOCATE_BIOME_VERTICAL_BLOCK_CHECK_INTERVAL() { return wrapperContained.LOCATE_BIOME_VERTICAL_BLOCK_CHECK_INTERVAL; }
// public int LOCATE_POI_RADIUS() { return wrapperContained.LOCATE_POI_RADIUS; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public float getDistance(int x1,int y1,int x2,int y2) { return wrapperContained.getDistance(x1,y1,x2,y2); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int sendCoordinates(yarnwrap.server.command.ServerCommandSource source,Object structure,yarnwrap.util.math.BlockPos currentPos,com.mojang.datafixers.util.Pair result,java.lang.String successMessage,boolean includeY,java.time.Duration timeTaken) { return wrapperContained.sendCoordinates(source.wrapperContained,structure,currentPos.wrapperContained,result,successMessage,includeY,timeTaken); }
// public int executeLocateStructure(yarnwrap.server.command.ServerCommandSource source,Object predicate) { return wrapperContained.executeLocateStructure(source.wrapperContained,predicate); }
// public java.util.Optional getStructureListForPredicate(Object predicate,yarnwrap.registry.Registry structureRegistry) { return wrapperContained.getStructureListForPredicate(predicate,structureRegistry.wrapperContained); }
// public int executeLocateBiome(yarnwrap.server.command.ServerCommandSource source,Object predicate) { return wrapperContained.executeLocateBiome(source.wrapperContained,predicate); }
// public int executeLocatePoi(yarnwrap.server.command.ServerCommandSource source,Object predicate) { return wrapperContained.executeLocatePoi(source.wrapperContained,predicate); }
// // public int sendCoordinates(yarnwrap.server.command.ServerCommandSource source,Object predicate,yarnwrap.util.math.BlockPos currentPos,com.mojang.datafixers.util.Pair result,java.lang.String successMessage,boolean includeY,java.time.Duration timeTaken) { return wrapperContained.sendCoordinates(source.wrapperContained,predicate,currentPos.wrapperContained,result,successMessage,includeY,timeTaken); }
// public int sendCoordinates(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos currentPos,com.mojang.datafixers.util.Pair result,java.lang.String successMessage,boolean includeY,java.lang.String entryString,java.time.Duration timeTaken) { return wrapperContained.sendCoordinates(source.wrapperContained,currentPos.wrapperContained,result,successMessage,includeY,entryString,timeTaken); }

}