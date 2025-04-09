package yarnwrap.util.collection;
public class WeightedList { public net.minecraft.util.collection.WeightedList wrapperContained; public WeightedList(net.minecraft.util.collection.WeightedList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
public yarnwrap.util.collection.WeightedList shuffle() { return new yarnwrap.util.collection.WeightedList(wrapperContained.shuffle()); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec) { return wrapperContained.createCodec(codec); }
public yarnwrap.util.collection.WeightedList add(java.lang.Object data,int weight) { return new yarnwrap.util.collection.WeightedList(wrapperContained.add(data,weight)); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }

}