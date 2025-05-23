package yarnwrap.loot.operator;
public class BoundedIntUnaryOperator { public net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained; public BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider max() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.max); }
// public void max(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.max = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider max() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.operator.BoundedIntUnaryOperator.max); }
// public static void max(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.max = value.wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider min() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.min); }
// public void min(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.min = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider min() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.operator.BoundedIntUnaryOperator.min); }
// public static void min(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.min = value.wrapperContained; }

// public Object applier() { return wrapperContained.applier; }
// // public void applier(Object value) { wrapperContained.applier = value; }
// // public static Object applier() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.applier; }
// // public static void applier(Object value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.applier = value; }

// public Object tester() { return wrapperContained.tester; }
// // public void tester(Object value) { wrapperContained.tester = value; }
// // public static Object tester() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.tester; }
// // public static void tester(Object value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.tester = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.CODEC = value; }

// public com.mojang.serialization.Codec OPERATOR_CODEC() { return wrapperContained.OPERATOR_CODEC; }
// public void OPERATOR_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OPERATOR_CODEC = value; }
// public static com.mojang.serialization.Codec OPERATOR_CODEC() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.OPERATOR_CODEC; }
// public static void OPERATOR_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.operator.BoundedIntUnaryOperator.OPERATOR_CODEC = value; }

// public BoundedIntUnaryOperator(java.util.Optional min,java.util.Optional max) { this.wrapperContained = new net.minecraft.loot.operator.BoundedIntUnaryOperator(min,max); }
// public BoundedIntUnaryOperator(yarnwrap.loot.provider.number.LootNumberProvider min,yarnwrap.loot.provider.number.LootNumberProvider max) { this.wrapperContained = new net.minecraft.loot.operator.BoundedIntUnaryOperator(min.wrapperContained,max.wrapperContained); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator createMax(int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMax(max)); }
// public static yarnwrap.loot.operator.BoundedIntUnaryOperator createMax(int max, ) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator.createMax(max)); }
// public int method_279(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.method_279(context.wrapperContained,value); }
// public static int method_279(yarnwrap.loot.context.LootContext context,int value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_279(context.wrapperContained,value); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator createMin(int min) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.createMin(min)); }
// public static yarnwrap.loot.operator.BoundedIntUnaryOperator createMin(int min, ) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator.createMin(min)); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int min,int max) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(min,max)); }
// public static yarnwrap.loot.operator.BoundedIntUnaryOperator create(int min,int max, ) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator.create(min,max)); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }
// public static java.util.Set getRequiredParameters() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.getRequiredParameters(); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator create(int value) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.create(value)); }
// public static yarnwrap.loot.operator.BoundedIntUnaryOperator create(int value, ) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator.create(value)); }
public int apply(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.apply(context.wrapperContained,value); }
// public static int apply(yarnwrap.loot.context.LootContext context,int value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.apply(context.wrapperContained,value); }
// public boolean method_32390(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value) { return wrapperContained.method_32390(context.wrapperContained,value.wrapperContained); }
// public static boolean method_32390(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32390(context.wrapperContained,value.wrapperContained); }
// public boolean method_32391(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.provider.number.LootNumberProvider value) { return wrapperContained.method_32391(context.wrapperContained,value.wrapperContained); }
// public static boolean method_32391(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.provider.number.LootNumberProvider value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32391(context.wrapperContained,value.wrapperContained); }
public boolean test(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.test(context.wrapperContained,value); }
// public static boolean test(yarnwrap.loot.context.LootContext context,int value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.test(context.wrapperContained,value); }
// public int method_32394(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value) { return wrapperContained.method_32394(context.wrapperContained,value.wrapperContained); }
// public static int method_32394(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32394(context.wrapperContained,value.wrapperContained); }
// public int method_32395(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.provider.number.LootNumberProvider value) { return wrapperContained.method_32395(context.wrapperContained,value.wrapperContained); }
// public static int method_32395(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.provider.number.LootNumberProvider value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32395(context.wrapperContained,value.wrapperContained); }
// public boolean method_32396(yarnwrap.loot.context.LootContext context,int value) { return wrapperContained.method_32396(context.wrapperContained,value); }
// public static boolean method_32396(yarnwrap.loot.context.LootContext context,int value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32396(context.wrapperContained,value); }
// public boolean method_32397(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value) { return wrapperContained.method_32397(context.wrapperContained,value.wrapperContained); }
// public static boolean method_32397(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32397(context.wrapperContained,value.wrapperContained); }
// public int method_32398(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value) { return wrapperContained.method_32398(context.wrapperContained,value.wrapperContained); }
// public static int method_32398(yarnwrap.loot.provider.number.LootNumberProvider context,yarnwrap.loot.context.LootContext value, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_32398(context.wrapperContained,value.wrapperContained); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator method_53260(com.mojang.datafixers.util.Either either) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.method_53260(either)); }
// public static yarnwrap.loot.operator.BoundedIntUnaryOperator method_53260(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(net.minecraft.loot.operator.BoundedIntUnaryOperator.method_53260(either)); }
// public com.mojang.datafixers.kinds.App method_53261(Object instance) { return wrapperContained.method_53261(instance); }
// public static com.mojang.datafixers.kinds.App method_53261(Object instance, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_53261(instance); }
// public com.mojang.datafixers.util.Either method_53262(yarnwrap.loot.operator.BoundedIntUnaryOperator operator) { return wrapperContained.method_53262(operator.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_53262(yarnwrap.loot.operator.BoundedIntUnaryOperator operator, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_53262(operator.wrapperContained); }
// public java.util.OptionalInt getConstantValue() { return wrapperContained.getConstantValue(); }
// public static java.util.OptionalInt getConstantValue() { return net.minecraft.loot.operator.BoundedIntUnaryOperator.getConstantValue(); }
// public java.util.Optional method_53264(yarnwrap.loot.operator.BoundedIntUnaryOperator operator) { return wrapperContained.method_53264(operator.wrapperContained); }
// public static java.util.Optional method_53264(yarnwrap.loot.operator.BoundedIntUnaryOperator operator, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_53264(operator.wrapperContained); }
// public java.util.Optional method_53265(yarnwrap.loot.operator.BoundedIntUnaryOperator operator) { return wrapperContained.method_53265(operator.wrapperContained); }
// public static java.util.Optional method_53265(yarnwrap.loot.operator.BoundedIntUnaryOperator operator, ) { return net.minecraft.loot.operator.BoundedIntUnaryOperator.method_53265(operator.wrapperContained); }

}