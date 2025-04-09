package yarnwrap.screen;
public class HorseScreenHandler { public net.minecraft.screen.HorseScreenHandler wrapperContained; public HorseScreenHandler(net.minecraft.screen.HorseScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory horseArmorInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.horseArmorInventory); }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }

}