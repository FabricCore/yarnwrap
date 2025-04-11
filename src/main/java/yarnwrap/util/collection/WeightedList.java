package yarnwrap.util.collection;
public class WeightedList { public net.minecraft.util.collection.WeightedList wrapperContained; public WeightedList(net.minecraft.util.collection.WeightedList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public WeightedList(java.util.List list) { this.wrapperContained = new net.minecraft.util.collection.WeightedList(list); }
public yarnwrap.util.collection.WeightedList shuffle() { return new yarnwrap.util.collection.WeightedList(wrapperContained.shuffle()); }
// public void method_35089(Object entry) { wrapperContained.method_35089(entry); }
// public java.util.List method_35090(yarnwrap.util.collection.WeightedList weightedList) { return wrapperContained.method_35090(weightedList.wrapperContained); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec) { return wrapperContained.createCodec(codec); }
public yarnwrap.util.collection.WeightedList add(java.lang.Object data,int weight) { return new yarnwrap.util.collection.WeightedList(wrapperContained.add(data,weight)); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }

}