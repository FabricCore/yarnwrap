package yarnwrap.structure.rule;
public class PosRuleTest { public net.minecraft.structure.rule.PosRuleTest wrapperContained; public PosRuleTest(net.minecraft.structure.rule.PosRuleTest wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.structure.rule.PosRuleTest.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.structure.rule.PosRuleTest.BASE_CODEC = value; }

// public yarnwrap.structure.rule.PosRuleTestType getType() { return new yarnwrap.structure.rule.PosRuleTestType(wrapperContained.getType()); }
// public static yarnwrap.structure.rule.PosRuleTestType getType() { return new yarnwrap.structure.rule.PosRuleTestType(net.minecraft.structure.rule.PosRuleTest.getType()); }
public boolean test(yarnwrap.util.math.BlockPos originalPos,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.random.Random random) { return wrapperContained.test(originalPos.wrapperContained,currentPos.wrapperContained,pivot.wrapperContained,random.wrapperContained); }
// public static boolean test(yarnwrap.util.math.BlockPos originalPos,yarnwrap.util.math.BlockPos currentPos,yarnwrap.util.math.BlockPos pivot,yarnwrap.util.math.random.Random random, ) { return net.minecraft.structure.rule.PosRuleTest.test(originalPos.wrapperContained,currentPos.wrapperContained,pivot.wrapperContained,random.wrapperContained); }

}