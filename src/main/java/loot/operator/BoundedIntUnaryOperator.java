package yarnwrap.loot.operator;
public class BoundedIntUnaryOperator { public net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained; public BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object applier() { return wrapperContained.applier; }
// public Object tester() { return wrapperContained.tester; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec OPERATOR_CODEC() { return wrapperContained.OPERATOR_CODEC; }
// public yarnwrap.loot.provider.number.LootNumberProvider max() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.max); }
// public yarnwrap.loot.provider.number.LootNumberProvider min() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.min); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator createMax(int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMax(max)); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator createMin(int min) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMin(min)); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int min,int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(min,max)); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }
public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int value) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(value)); }
public int apply(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.apply(context.wrapperContained,value); }
public boolean test(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.test(context.wrapperContained,value); }
// public java.util.OptionalInt getConstantValue() { return wrapperContained.getConstantValue(); }

}