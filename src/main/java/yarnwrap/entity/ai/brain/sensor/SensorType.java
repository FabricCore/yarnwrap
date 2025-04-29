package yarnwrap.entity.ai.brain.sensor;
public class SensorType { public net.minecraft.entity.ai.brain.sensor.SensorType wrapperContained; public SensorType(net.minecraft.entity.ai.brain.sensor.SensorType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier factory() { return wrapperContained.factory; }
// public void factory(java.util.function.Supplier value) { wrapperContained.factory = value; }
// public static java.util.function.Supplier factory() { return net.minecraft.entity.ai.brain.sensor.SensorType.factory; }
// public static void factory(java.util.function.Supplier value, ) { net.minecraft.entity.ai.brain.sensor.SensorType.factory = value; }

public SensorType(java.util.function.Supplier factory) { this.wrapperContained = new net.minecraft.entity.ai.brain.sensor.SensorType(factory); }
public yarnwrap.entity.ai.brain.sensor.Sensor create() { return new yarnwrap.entity.ai.brain.sensor.Sensor(wrapperContained.create()); }
// public static yarnwrap.entity.ai.brain.sensor.Sensor create() { return new yarnwrap.entity.ai.brain.sensor.Sensor(net.minecraft.entity.ai.brain.sensor.SensorType.create()); }
// public yarnwrap.entity.ai.brain.sensor.SensorType register(java.lang.String id,java.util.function.Supplier factory) { return new yarnwrap.entity.ai.brain.sensor.SensorType(wrapperContained.register(id,factory)); }
// public static yarnwrap.entity.ai.brain.sensor.SensorType register(java.lang.String id,java.util.function.Supplier factory, ) { return new yarnwrap.entity.ai.brain.sensor.SensorType(net.minecraft.entity.ai.brain.sensor.SensorType.register(id,factory)); }

}