package yarnwrap.loot.condition;
public class WeatherCheckLootCondition { public net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained; public WeatherCheckLootCondition(net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional raining() { return wrapperContained.raining; }
// public void raining(java.util.Optional value) { wrapperContained.raining = value; }
// public java.util.Optional thundering() { return wrapperContained.thundering; }
// public void thundering(java.util.Optional value) { wrapperContained.thundering = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional raining() { return wrapperContained.raining(); }
// public java.util.Optional thundering() { return wrapperContained.thundering(); }
public Object create() { return wrapperContained.create(); }

}