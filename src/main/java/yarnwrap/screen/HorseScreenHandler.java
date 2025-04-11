package yarnwrap.screen;
public class HorseScreenHandler { public net.minecraft.screen.HorseScreenHandler wrapperContained; public HorseScreenHandler(net.minecraft.screen.HorseScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory horseArmorInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.horseArmorInventory); }
// public void horseArmorInventory(yarnwrap.inventory.Inventory value) { wrapperContained.horseArmorInventory = value.wrapperContained; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.entity = value.wrapperContained; }

}