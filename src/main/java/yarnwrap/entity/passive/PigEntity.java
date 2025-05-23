package yarnwrap.entity.passive;
public class PigEntity { public net.minecraft.entity.passive.PigEntity wrapperContained; public PigEntity(net.minecraft.entity.passive.PigEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData BOOST_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BOOST_TIME); }
// public void BOOST_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.BOOST_TIME = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BOOST_TIME() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.PigEntity.BOOST_TIME); }
// public static void BOOST_TIME(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.PigEntity.BOOST_TIME = value.wrapperContained; }

// public yarnwrap.entity.SaddledComponent saddledComponent() { return new yarnwrap.entity.SaddledComponent(wrapperContained.saddledComponent); }
// public void saddledComponent(yarnwrap.entity.SaddledComponent value) { wrapperContained.saddledComponent = value.wrapperContained; }
// public static yarnwrap.entity.SaddledComponent saddledComponent() { return new yarnwrap.entity.SaddledComponent(net.minecraft.entity.passive.PigEntity.saddledComponent); }
// public static void saddledComponent(yarnwrap.entity.SaddledComponent value, ) { net.minecraft.entity.passive.PigEntity.saddledComponent = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.PigEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.PigEntity.VARIANT = value.wrapperContained; }

// public Object createPigAttributes() { return wrapperContained.createPigAttributes(); }
public static Object createPigAttributes() { return net.minecraft.entity.passive.PigEntity.createPigAttributes(); }
// public boolean method_58372(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58372(stack.wrapperContained); }
// public static boolean method_58372(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.PigEntity.method_58372(stack.wrapperContained); }
// public boolean method_58373(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58373(stack.wrapperContained); }
// public static boolean method_58373(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.PigEntity.method_58373(stack.wrapperContained); }
// public void method_63649(yarnwrap.entity.mob.ZombifiedPiglinEntity zombifiedPiglin) { wrapperContained.method_63649(zombifiedPiglin.wrapperContained); }
// public static void method_63649(yarnwrap.entity.mob.ZombifiedPiglinEntity zombifiedPiglin, ) { net.minecraft.entity.passive.PigEntity.method_63649(zombifiedPiglin.wrapperContained); }
// public void setVariant(yarnwrap.registry.entry.RegistryEntry variant) { wrapperContained.setVariant(variant.wrapperContained); }
// public static void setVariant(yarnwrap.registry.entry.RegistryEntry variant, ) { net.minecraft.entity.passive.PigEntity.setVariant(variant.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getVariant()); }
// public static yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.passive.PigEntity.getVariant()); }

}