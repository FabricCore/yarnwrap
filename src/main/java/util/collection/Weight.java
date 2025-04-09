package yarnwrap.util.collection;
public class Weight { public net.minecraft.util.collection.Weight wrapperContained; public Weight(net.minecraft.util.collection.Weight wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.collection.Weight DEFAULT() { return new yarnwrap.util.collection.Weight(wrapperContained.DEFAULT); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int value() { return wrapperContained.value; }
public int getValue() { return wrapperContained.getValue(); }
public yarnwrap.util.collection.Weight of(int weight) { return new yarnwrap.util.collection.Weight(wrapperContained.of(weight)); }
// public void validate(int weight) { wrapperContained.validate(weight); }

}