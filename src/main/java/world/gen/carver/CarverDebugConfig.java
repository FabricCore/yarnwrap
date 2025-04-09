package yarnwrap.world.gen.carver;
public class CarverDebugConfig { public net.minecraft.world.gen.carver.CarverDebugConfig wrapperContained; public CarverDebugConfig(net.minecraft.world.gen.carver.CarverDebugConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.carver.CarverDebugConfig DEFAULT() { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public boolean debugMode() { return wrapperContained.debugMode; }
// public yarnwrap.block.BlockState airState() { return new yarnwrap.block.BlockState(wrapperContained.airState); }
// public yarnwrap.block.BlockState waterState() { return new yarnwrap.block.BlockState(wrapperContained.waterState); }
// public yarnwrap.block.BlockState lavaState() { return new yarnwrap.block.BlockState(wrapperContained.lavaState); }
// public yarnwrap.block.BlockState barrierState() { return new yarnwrap.block.BlockState(wrapperContained.barrierState); }
public boolean isDebugMode() { return wrapperContained.isDebugMode(); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(boolean debugMode,yarnwrap.block.BlockState debugState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(debugMode,debugState.wrapperContained)); }
public yarnwrap.block.BlockState getAirState() { return new yarnwrap.block.BlockState(wrapperContained.getAirState()); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(yarnwrap.block.BlockState airState,yarnwrap.block.BlockState waterState,yarnwrap.block.BlockState lavaState,yarnwrap.block.BlockState barrierState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(airState.wrapperContained,waterState.wrapperContained,lavaState.wrapperContained,barrierState.wrapperContained)); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(boolean debugMode,yarnwrap.block.BlockState airState,yarnwrap.block.BlockState waterState,yarnwrap.block.BlockState lavaState,yarnwrap.block.BlockState barrierState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(debugMode,airState.wrapperContained,waterState.wrapperContained,lavaState.wrapperContained,barrierState.wrapperContained)); }
public yarnwrap.block.BlockState getWaterState() { return new yarnwrap.block.BlockState(wrapperContained.getWaterState()); }
public yarnwrap.block.BlockState getLavaState() { return new yarnwrap.block.BlockState(wrapperContained.getLavaState()); }
public yarnwrap.block.BlockState getBarrierState() { return new yarnwrap.block.BlockState(wrapperContained.getBarrierState()); }

}