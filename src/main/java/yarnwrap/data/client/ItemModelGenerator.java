package yarnwrap.data.client;
public class ItemModelGenerator { public net.minecraft.data.client.ItemModelGenerator wrapperContained; public ItemModelGenerator(net.minecraft.data.client.ItemModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.BiConsumer writer() { return wrapperContained.writer; }
// public void writer(java.util.function.BiConsumer value) { wrapperContained.writer = value; }
// public static java.util.function.BiConsumer writer() { return net.minecraft.data.client.ItemModelGenerator.writer; }
// public static void writer(java.util.function.BiConsumer value, ) { net.minecraft.data.client.ItemModelGenerator.writer = value; }

// public yarnwrap.util.Identifier TRIM_TYPE() { return new yarnwrap.util.Identifier(wrapperContained.TRIM_TYPE); }
// public void TRIM_TYPE(yarnwrap.util.Identifier value) { wrapperContained.TRIM_TYPE = value.wrapperContained; }
public static yarnwrap.util.Identifier TRIM_TYPE() { return new yarnwrap.util.Identifier(net.minecraft.data.client.ItemModelGenerator.TRIM_TYPE); }
// public static void TRIM_TYPE(yarnwrap.util.Identifier value, ) { net.minecraft.data.client.ItemModelGenerator.TRIM_TYPE = value.wrapperContained; }

// public java.util.List TRIM_MATERIALS() { return wrapperContained.TRIM_MATERIALS; }
// public void TRIM_MATERIALS(java.util.List value) { wrapperContained.TRIM_MATERIALS = value; }
// public static java.util.List TRIM_MATERIALS() { return net.minecraft.data.client.ItemModelGenerator.TRIM_MATERIALS; }
// public static void TRIM_MATERIALS(java.util.List value, ) { net.minecraft.data.client.ItemModelGenerator.TRIM_MATERIALS = value; }

public ItemModelGenerator(java.util.function.BiConsumer writer) { this.wrapperContained = new net.minecraft.data.client.ItemModelGenerator(writer); }
public void register() { wrapperContained.register(); }
// public static void register() { net.minecraft.data.client.ItemModelGenerator.register(); }
public void register(yarnwrap.item.Item item,yarnwrap.item.Item texture,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,texture.wrapperContained,model.wrapperContained); }
// public static void register(yarnwrap.item.Item item,yarnwrap.item.Item texture,yarnwrap.data.client.Model model, ) { net.minecraft.data.client.ItemModelGenerator.register(item.wrapperContained,texture.wrapperContained,model.wrapperContained); }
public void register(yarnwrap.item.Item item,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,model.wrapperContained); }
// public static void register(yarnwrap.item.Item item,yarnwrap.data.client.Model model, ) { net.minecraft.data.client.ItemModelGenerator.register(item.wrapperContained,model.wrapperContained); }
public void register(yarnwrap.item.Item item,java.lang.String suffix,yarnwrap.data.client.Model model) { wrapperContained.register(item.wrapperContained,suffix,model.wrapperContained); }
// public static void register(yarnwrap.item.Item item,java.lang.String suffix,yarnwrap.data.client.Model model, ) { net.minecraft.data.client.ItemModelGenerator.register(item.wrapperContained,suffix,model.wrapperContained); }
public void registerCompass(yarnwrap.item.Item compass) { wrapperContained.registerCompass(compass.wrapperContained); }
// public static void registerCompass(yarnwrap.item.Item compass, ) { net.minecraft.data.client.ItemModelGenerator.registerCompass(compass.wrapperContained); }
public void registerClock(yarnwrap.item.Item clock) { wrapperContained.registerClock(clock.wrapperContained); }
// public static void registerClock(yarnwrap.item.Item clock, ) { net.minecraft.data.client.ItemModelGenerator.registerClock(clock.wrapperContained); }
public void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1) { wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained); }
// public static void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1, ) { net.minecraft.data.client.ItemModelGenerator.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained); }
public yarnwrap.util.Identifier suffixTrim(yarnwrap.util.Identifier id,java.lang.String trimMaterialName) { return new yarnwrap.util.Identifier(wrapperContained.suffixTrim(id.wrapperContained,trimMaterialName)); }
// public static yarnwrap.util.Identifier suffixTrim(yarnwrap.util.Identifier id,java.lang.String trimMaterialName, ) { return new yarnwrap.util.Identifier(net.minecraft.data.client.ItemModelGenerator.suffixTrim(id.wrapperContained,trimMaterialName)); }
public com.google.gson.JsonObject createArmorJson(yarnwrap.util.Identifier id,java.util.Map textures,yarnwrap.registry.entry.RegistryEntry armorMaterial) { return wrapperContained.createArmorJson(id.wrapperContained,textures,armorMaterial.wrapperContained); }
// public static com.google.gson.JsonObject createArmorJson(yarnwrap.util.Identifier id,java.util.Map textures,yarnwrap.registry.entry.RegistryEntry armorMaterial, ) { return net.minecraft.data.client.ItemModelGenerator.createArmorJson(id.wrapperContained,textures,armorMaterial.wrapperContained); }
// public com.google.gson.JsonObject method_48522(yarnwrap.item.ArmorItem id,yarnwrap.util.Identifier textures) { return wrapperContained.method_48522(id.wrapperContained,textures.wrapperContained); }
// public static com.google.gson.JsonObject method_48522(yarnwrap.item.ArmorItem id,yarnwrap.util.Identifier textures, ) { return net.minecraft.data.client.ItemModelGenerator.method_48522(id.wrapperContained,textures.wrapperContained); }
public void registerArmor(yarnwrap.item.ArmorItem armor) { wrapperContained.registerArmor(armor.wrapperContained); }
// public static void registerArmor(yarnwrap.item.ArmorItem armor, ) { net.minecraft.data.client.ItemModelGenerator.registerArmor(armor.wrapperContained); }
public void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2) { wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained); }
// public static void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2, ) { net.minecraft.data.client.ItemModelGenerator.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained); }
// public com.google.gson.JsonObject method_48743(yarnwrap.item.ArmorItem id,yarnwrap.util.Identifier textures) { return wrapperContained.method_48743(id.wrapperContained,textures.wrapperContained); }
// public static com.google.gson.JsonObject method_48743(yarnwrap.item.ArmorItem id,yarnwrap.util.Identifier textures, ) { return net.minecraft.data.client.ItemModelGenerator.method_48743(id.wrapperContained,textures.wrapperContained); }
public void registerWolfArmor(yarnwrap.item.Item armor) { wrapperContained.registerWolfArmor(armor.wrapperContained); }
// public static void registerWolfArmor(yarnwrap.item.Item armor, ) { net.minecraft.data.client.ItemModelGenerator.registerWolfArmor(armor.wrapperContained); }

}