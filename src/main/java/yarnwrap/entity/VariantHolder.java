package yarnwrap.entity;
public class VariantHolder { public net.minecraft.entity.VariantHolder wrapperContained; public VariantHolder(net.minecraft.entity.VariantHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public void setVariant(java.lang.Object variant) { wrapperContained.setVariant(variant); }
public java.lang.Object getVariant() { return wrapperContained.getVariant(); }

}