package yarnwrap.util.collection;
public class WeightedList { public net.minecraft.util.collection.WeightedList wrapperContained; public WeightedList(net.minecraft.util.collection.WeightedList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.util.collection.WeightedList.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.util.collection.WeightedList.entries = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.util.collection.WeightedList.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.util.collection.WeightedList.random = value.wrapperContained; }

// public WeightedList(java.util.List list) { this.wrapperContained = new net.minecraft.util.collection.WeightedList(list); }
public yarnwrap.util.collection.WeightedList shuffle() { return new yarnwrap.util.collection.WeightedList(wrapperContained.shuffle()); }
// public static yarnwrap.util.collection.WeightedList shuffle() { return new yarnwrap.util.collection.WeightedList(net.minecraft.util.collection.WeightedList.shuffle()); }
// public void method_35089(Object entry) { wrapperContained.method_35089(entry); }
// public static void method_35089(Object entry, ) { net.minecraft.util.collection.WeightedList.method_35089(entry); }
// public java.util.List method_35090(yarnwrap.util.collection.WeightedList weightedList) { return wrapperContained.method_35090(weightedList.wrapperContained); }
// public static java.util.List method_35090(yarnwrap.util.collection.WeightedList weightedList, ) { return net.minecraft.util.collection.WeightedList.method_35090(weightedList.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec) { return wrapperContained.createCodec(codec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec, ) { return net.minecraft.util.collection.WeightedList.createCodec(codec); }
public yarnwrap.util.collection.WeightedList add(java.lang.Object data,int weight) { return new yarnwrap.util.collection.WeightedList(wrapperContained.add(data,weight)); }
// public static yarnwrap.util.collection.WeightedList add(java.lang.Object data,int weight, ) { return new yarnwrap.util.collection.WeightedList(net.minecraft.util.collection.WeightedList.add(data,weight)); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.util.collection.WeightedList.stream(); }

}