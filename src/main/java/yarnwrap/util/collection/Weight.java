package yarnwrap.util.collection;
public class Weight { public net.minecraft.util.collection.Weight wrapperContained; public Weight(net.minecraft.util.collection.Weight wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.collection.Weight DEFAULT() { return new yarnwrap.util.collection.Weight(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.util.collection.Weight value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public Weight(int weight) { this.wrapperContained = new net.minecraft.util.collection.Weight(weight); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public int getValue() { return wrapperContained.getValue(); }
public yarnwrap.util.collection.Weight of(int weight) { return new yarnwrap.util.collection.Weight(wrapperContained.of(weight)); }
// public void validate(int weight) { wrapperContained.validate(weight); }

}