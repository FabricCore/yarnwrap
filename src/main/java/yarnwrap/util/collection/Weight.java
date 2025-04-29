package yarnwrap.util.collection;
public class Weight { public net.minecraft.util.collection.Weight wrapperContained; public Weight(net.minecraft.util.collection.Weight wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.collection.Weight.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.collection.Weight.CODEC = value; }

// public yarnwrap.util.collection.Weight DEFAULT() { return new yarnwrap.util.collection.Weight(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.util.collection.Weight value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public static yarnwrap.util.collection.Weight DEFAULT() { return new yarnwrap.util.collection.Weight(net.minecraft.util.collection.Weight.DEFAULT); }
// public static void DEFAULT(yarnwrap.util.collection.Weight value, ) { net.minecraft.util.collection.Weight.DEFAULT = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.collection.Weight.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.collection.Weight.LOGGER = value; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public static int value() { return net.minecraft.util.collection.Weight.value; }
// public static void value(int value, ) { net.minecraft.util.collection.Weight.value = value; }

// public Weight(int weight) { this.wrapperContained = new net.minecraft.util.collection.Weight(weight); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.collection.Weight.equals(o); }
public int getValue() { return wrapperContained.getValue(); }
// public static int getValue() { return net.minecraft.util.collection.Weight.getValue(); }
// public yarnwrap.util.collection.Weight of(int weight) { return new yarnwrap.util.collection.Weight(wrapperContained.of(weight)); }
// public static yarnwrap.util.collection.Weight of(int weight, ) { return new yarnwrap.util.collection.Weight(net.minecraft.util.collection.Weight.of(weight)); }
// public void validate(int weight) { wrapperContained.validate(weight); }
// public static void validate(int weight, ) { net.minecraft.util.collection.Weight.validate(weight); }

}