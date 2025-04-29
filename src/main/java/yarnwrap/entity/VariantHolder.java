package yarnwrap.entity;
public class VariantHolder { public net.minecraft.entity.VariantHolder wrapperContained; public VariantHolder(net.minecraft.entity.VariantHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public void setVariant(java.lang.Object variant) { wrapperContained.setVariant(variant); }
// public static void setVariant(java.lang.Object variant, ) { net.minecraft.entity.VariantHolder.setVariant(variant); }
public java.lang.Object getVariant() { return wrapperContained.getVariant(); }
// public static java.lang.Object getVariant() { return net.minecraft.entity.VariantHolder.getVariant(); }

}