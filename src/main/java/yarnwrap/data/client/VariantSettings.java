package yarnwrap.data.client;
public class VariantSettings { public net.minecraft.data.client.VariantSettings wrapperContained; public VariantSettings(net.minecraft.data.client.VariantSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.data.client.VariantSetting X() { return new yarnwrap.data.client.VariantSetting(wrapperContained.X); }
// public void X(yarnwrap.data.client.VariantSetting value) { wrapperContained.X = value.wrapperContained; }
public yarnwrap.data.client.VariantSetting Y() { return new yarnwrap.data.client.VariantSetting(wrapperContained.Y); }
// public void Y(yarnwrap.data.client.VariantSetting value) { wrapperContained.Y = value.wrapperContained; }
public yarnwrap.data.client.VariantSetting MODEL() { return new yarnwrap.data.client.VariantSetting(wrapperContained.MODEL); }
// public void MODEL(yarnwrap.data.client.VariantSetting value) { wrapperContained.MODEL = value.wrapperContained; }
public yarnwrap.data.client.VariantSetting UVLOCK() { return new yarnwrap.data.client.VariantSetting(wrapperContained.UVLOCK); }
// public void UVLOCK(yarnwrap.data.client.VariantSetting value) { wrapperContained.UVLOCK = value.wrapperContained; }
public yarnwrap.data.client.VariantSetting WEIGHT() { return new yarnwrap.data.client.VariantSetting(wrapperContained.WEIGHT); }
// public void WEIGHT(yarnwrap.data.client.VariantSetting value) { wrapperContained.WEIGHT = value.wrapperContained; }

}