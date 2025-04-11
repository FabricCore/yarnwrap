package yarnwrap.data.client;
public class ItemModelGenerator { public net.minecraft.data.client.ItemModelGenerator wrapperContained; public ItemModelGenerator(net.minecraft.data.client.ItemModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.BiConsumer writer() { return wrapperContained.writer; }
// public void writer(java.util.function.BiConsumer value) { wrapperContained.writer = value; }
public yarnwrap.util.Identifier TRIM_TYPE() { return new yarnwrap.util.Identifier(wrapperContained.TRIM_TYPE); }
// public void TRIM_TYPE(yarnwrap.util.Identifier value) { wrapperContained.TRIM_TYPE = value.wrapperContained; }
// public java.util.List TRIM_MATERIALS() { return wrapperContained.TRIM_MATERIALS; }
// public void TRIM_MATERIALS(java.util.List value) { wrapperContained.TRIM_MATERIALS = value; }
public void register() { wrapperContained.register(); }
// public void register(yarnwrap.item.Item item,yarnwrap.item.Item texture,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,texture.wrapperContained,model.wrapperContained); }
// public void register(yarnwrap.item.Item item,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,model.wrapperContained); }
// public void register(yarnwrap.item.Item item,java.lang.String suffix,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,suffix,model.wrapperContained); }
// public void registerCompass(yarnwrap.item.Item compass) { wrapperContained.registerCompass(compass.wrapperContained); }
// public void registerClock(yarnwrap.item.Item clock) { wrapperContained.registerClock(clock.wrapperContained); }
// public void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1) { wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained); }
// public yarnwrap.util.Identifier suffixTrim(yarnwrap.util.Identifier id,java.lang.String trimMaterialName) { return new yarnwrap.util.Identifier(wrapperContained.suffixTrim(id.wrapperContained,trimMaterialName)); }
// public com.google.gson.JsonObject createArmorJson(yarnwrap.util.Identifier id,java.util.Map textures,yarnwrap.registry.entry.RegistryEntry armorMaterial) { return wrapperContained.createArmorJson(id.wrapperContained,textures,armorMaterial.wrapperContained); }
// public void registerArmor(yarnwrap.item.ArmorItem armor) { wrapperContained.registerArmor(armor.wrapperContained); }
// public void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2) { wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained); }
// public void registerWolfArmor(yarnwrap.item.Item armor) { wrapperContained.registerWolfArmor(armor.wrapperContained); }

}