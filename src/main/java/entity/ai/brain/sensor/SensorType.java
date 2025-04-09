package yarnwrap.entity.ai.brain.sensor;
public class SensorType { public net.minecraft.entity.ai.brain.sensor.SensorType wrapperContained; public SensorType(net.minecraft.entity.ai.brain.sensor.SensorType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier factory() { return wrapperContained.factory; }
public yarnwrap.entity.ai.brain.sensor.Sensor create() { return new yarnwrap.entity.ai.brain.sensor.Sensor(wrapperContained.create()); }
// public yarnwrap.entity.ai.brain.sensor.SensorType register(java.lang.String id,java.util.function.Supplier factory) { return new yarnwrap.entity.ai.brain.sensor.SensorType(wrapperContained.register(id,factory)); }

}