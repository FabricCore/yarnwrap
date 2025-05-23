package yarnwrap.datafixer.fix;
public class FoodToConsumableFix { public net.minecraft.datafixer.fix.FoodToConsumableFix wrapperContained; public FoodToConsumableFix(net.minecraft.datafixer.fix.FoodToConsumableFix wrapperContained) { this.wrapperContained = wrapperContained; }

public FoodToConsumableFix(com.mojang.datafixers.schemas.Schema schema) { this.wrapperContained = new net.minecraft.datafixer.fix.FoodToConsumableFix(schema); }

}