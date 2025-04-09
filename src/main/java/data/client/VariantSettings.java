package yarnwrap.data.client;
public class VariantSettings { public net.minecraft.data.client.VariantSettings wrapperContained; public VariantSettings(net.minecraft.data.client.VariantSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.client.VariantSetting X() { return new yarnwrap.data.client.VariantSetting(wrapperContained.X); }
public yarnwrap.data.client.VariantSetting Y() { return new yarnwrap.data.client.VariantSetting(wrapperContained.Y); }
public yarnwrap.data.client.VariantSetting MODEL() { return new yarnwrap.data.client.VariantSetting(wrapperContained.MODEL); }
public yarnwrap.data.client.VariantSetting UVLOCK() { return new yarnwrap.data.client.VariantSetting(wrapperContained.UVLOCK); }
public yarnwrap.data.client.VariantSetting WEIGHT() { return new yarnwrap.data.client.VariantSetting(wrapperContained.WEIGHT); }

}