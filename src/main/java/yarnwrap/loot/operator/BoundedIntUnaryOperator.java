package yarnwrap.loot.operator;
public class BoundedIntUnaryOperator { public net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained; public BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object applier() { return wrapperContained.applier; }
// // public void applier(Object value) { wrapperContained.applier = value; }
// public Object tester() { return wrapperContained.tester; }
// // public void tester(Object value) { wrapperContained.tester = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec OPERATOR_CODEC() { return wrapperContained.OPERATOR_CODEC; }
// public void OPERATOR_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OPERATOR_CODEC = value; }
// public yarnwrap.loot.provider.number.LootNumberProvider max() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.max); }
// public void max(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.max = value.wrapperContained; }
// public yarnwrap.loot.provider.number.LootNumberProvider min() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.min); }
// public void min(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.min = value.wrapperContained; }
public yarnwrap.loot.operator.BoundedIntUnaryOperator createMax(int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMax(max)); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator createMin(int min) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMin(min)); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int min,int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(min,max)); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int value) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(value)); }
public int apply(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.apply(context.wrapperContained,value); }
public boolean test(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.test(context.wrapperContained,value); }
// public java.util.OptionalInt getConstantValue() { return wrapperContained.getConstantValue(); }

}