package yarnwrap.test;
public class TestData { public net.minecraft.test.TestData wrapperContained; public TestData(net.minecraft.test.TestData wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.test.TestData.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.test.TestData.CODEC = value; }

public TestData(java.lang.Object environment,yarnwrap.util.Identifier structure,int maxTicks,int setupTicks,boolean required) { this.wrapperContained = new net.minecraft.test.TestData(environment,structure.wrapperContained,maxTicks,setupTicks,required); }
public TestData(java.lang.Object environment,yarnwrap.util.Identifier structure,int maxTicks,int setupTicks,boolean required,yarnwrap.util.BlockRotation rotation) { this.wrapperContained = new net.minecraft.test.TestData(environment,structure.wrapperContained,maxTicks,setupTicks,required,rotation.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67048(Object instance) { return wrapperContained.method_67048(instance); }
// public static com.mojang.datafixers.kinds.App method_67048(Object instance, ) { return net.minecraft.test.TestData.method_67048(instance); }
public yarnwrap.test.TestData applyToEnvironment(java.util.function.Function environmentFunction) { return new yarnwrap.test.TestData(wrapperContained.applyToEnvironment(environmentFunction)); }
// public static yarnwrap.test.TestData applyToEnvironment(java.util.function.Function environmentFunction, ) { return new yarnwrap.test.TestData(net.minecraft.test.TestData.applyToEnvironment(environmentFunction)); }

}