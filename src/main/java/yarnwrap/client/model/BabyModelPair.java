package yarnwrap.client.model;
public class BabyModelPair { public net.minecraft.client.model.BabyModelPair wrapperContained; public BabyModelPair(net.minecraft.client.model.BabyModelPair wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.Model get(boolean baby) { return new yarnwrap.client.model.Model(wrapperContained.get(baby)); }
// public static yarnwrap.client.model.Model get(boolean baby, ) { return new yarnwrap.client.model.Model(net.minecraft.client.model.BabyModelPair.get(baby)); }

}