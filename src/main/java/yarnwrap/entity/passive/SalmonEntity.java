package yarnwrap.entity.passive;
public class SalmonEntity { public net.minecraft.entity.passive.SalmonEntity wrapperContained; public SalmonEntity(net.minecraft.entity.passive.SalmonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SalmonEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SalmonEntity.VARIANT = value.wrapperContained; }

// public java.lang.String TYPE_KEY() { return wrapperContained.TYPE_KEY; }
// public void TYPE_KEY(java.lang.String value) { wrapperContained.TYPE_KEY = value; }
// public static java.lang.String TYPE_KEY() { return net.minecraft.entity.passive.SalmonEntity.TYPE_KEY; }
// public static void TYPE_KEY(java.lang.String value, ) { net.minecraft.entity.passive.SalmonEntity.TYPE_KEY = value; }

// public void setVariant(Object variant) { wrapperContained.setVariant(variant); }
// public static void setVariant(Object variant, ) { net.minecraft.entity.passive.SalmonEntity.setVariant(variant); }
public Object getVariant() { return wrapperContained.getVariant(); }
// public static Object getVariant() { return net.minecraft.entity.passive.SalmonEntity.getVariant(); }
public float getVariantScale() { return wrapperContained.getVariantScale(); }
// public static float getVariantScale() { return net.minecraft.entity.passive.SalmonEntity.getVariantScale(); }

}