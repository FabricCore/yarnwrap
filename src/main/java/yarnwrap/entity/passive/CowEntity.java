package yarnwrap.entity.passive;
public class CowEntity { public net.minecraft.entity.passive.CowEntity wrapperContained; public CowEntity(net.minecraft.entity.passive.CowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.CowEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.CowEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public Object createCowAttributes() { return wrapperContained.createCowAttributes(); }
public static Object createCowAttributes() { return net.minecraft.entity.passive.CowEntity.createCowAttributes(); }
// public boolean method_58367(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58367(stack.wrapperContained); }
// public static boolean method_58367(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.CowEntity.method_58367(stack.wrapperContained); }

}