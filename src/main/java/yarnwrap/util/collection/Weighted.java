package yarnwrap.util.collection;
public class Weighted { public net.minecraft.util.collection.Weighted wrapperContained; public Weighted(net.minecraft.util.collection.Weighted wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.collection.Weight getWeight() { return new yarnwrap.util.collection.Weight(wrapperContained.getWeight()); }
// public static yarnwrap.util.collection.Weight getWeight() { return new yarnwrap.util.collection.Weight(net.minecraft.util.collection.Weighted.getWeight()); }
// public Object of(java.lang.Object data,int weight) { return wrapperContained.of(data,weight); }
// public static Object of(java.lang.Object data,int weight, ) { return net.minecraft.util.collection.Weighted.of(data,weight); }

}