package yarnwrap.world.gen.carver;
public class CarverDebugConfig { public net.minecraft.world.gen.carver.CarverDebugConfig wrapperContained; public CarverDebugConfig(net.minecraft.world.gen.carver.CarverDebugConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.carver.CarverDebugConfig DEFAULT() { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.gen.carver.CarverDebugConfig value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public boolean debugMode() { return wrapperContained.debugMode; }
// public void debugMode(boolean value) { wrapperContained.debugMode = value; }
// public yarnwrap.block.BlockState airState() { return new yarnwrap.block.BlockState(wrapperContained.airState); }
// public void airState(yarnwrap.block.BlockState value) { wrapperContained.airState = value.wrapperContained; }
// public yarnwrap.block.BlockState waterState() { return new yarnwrap.block.BlockState(wrapperContained.waterState); }
// public void waterState(yarnwrap.block.BlockState value) { wrapperContained.waterState = value.wrapperContained; }
// public yarnwrap.block.BlockState lavaState() { return new yarnwrap.block.BlockState(wrapperContained.lavaState); }
// public void lavaState(yarnwrap.block.BlockState value) { wrapperContained.lavaState = value.wrapperContained; }
// public yarnwrap.block.BlockState barrierState() { return new yarnwrap.block.BlockState(wrapperContained.barrierState); }
// public void barrierState(yarnwrap.block.BlockState value) { wrapperContained.barrierState = value.wrapperContained; }
public boolean isDebugMode() { return wrapperContained.isDebugMode(); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(boolean debugMode,yarnwrap.block.BlockState debugState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(debugMode,debugState.wrapperContained)); }
public yarnwrap.block.BlockState getAirState() { return new yarnwrap.block.BlockState(wrapperContained.getAirState()); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(yarnwrap.block.BlockState airState,yarnwrap.block.BlockState waterState,yarnwrap.block.BlockState lavaState,yarnwrap.block.BlockState barrierState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(airState.wrapperContained,waterState.wrapperContained,lavaState.wrapperContained,barrierState.wrapperContained)); }
public yarnwrap.world.gen.carver.CarverDebugConfig create(boolean debugMode,yarnwrap.block.BlockState airState,yarnwrap.block.BlockState waterState,yarnwrap.block.BlockState lavaState,yarnwrap.block.BlockState barrierState) { return new yarnwrap.world.gen.carver.CarverDebugConfig(wrapperContained.create(debugMode,airState.wrapperContained,waterState.wrapperContained,lavaState.wrapperContained,barrierState.wrapperContained)); }
public yarnwrap.block.BlockState getWaterState() { return new yarnwrap.block.BlockState(wrapperContained.getWaterState()); }
public yarnwrap.block.BlockState getLavaState() { return new yarnwrap.block.BlockState(wrapperContained.getLavaState()); }
public yarnwrap.block.BlockState getBarrierState() { return new yarnwrap.block.BlockState(wrapperContained.getBarrierState()); }

}