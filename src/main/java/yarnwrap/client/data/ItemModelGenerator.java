package yarnwrap.client.data;
public class ItemModelGenerator { public net.minecraft.client.data.ItemModelGenerator wrapperContained; public ItemModelGenerator(net.minecraft.client.data.ItemModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.tint.TintSource UNTINTED() { return new yarnwrap.client.render.item.tint.TintSource(wrapperContained.UNTINTED); }
// public void UNTINTED(yarnwrap.client.render.item.tint.TintSource value) { wrapperContained.UNTINTED = value.wrapperContained; }
// public static yarnwrap.client.render.item.tint.TintSource UNTINTED() { return new yarnwrap.client.render.item.tint.TintSource(net.minecraft.client.data.ItemModelGenerator.UNTINTED); }
// public static void UNTINTED(yarnwrap.client.render.item.tint.TintSource value, ) { net.minecraft.client.data.ItemModelGenerator.UNTINTED = value.wrapperContained; }

// public java.util.List TRIM_MATERIALS() { return wrapperContained.TRIM_MATERIALS; }
// public void TRIM_MATERIALS(java.util.List value) { wrapperContained.TRIM_MATERIALS = value; }
public static java.util.List TRIM_MATERIALS() { return net.minecraft.client.data.ItemModelGenerator.TRIM_MATERIALS; }
// public static void TRIM_MATERIALS(java.util.List value, ) { net.minecraft.client.data.ItemModelGenerator.TRIM_MATERIALS = value; }

public yarnwrap.client.data.ItemModelOutput output() { return new yarnwrap.client.data.ItemModelOutput(wrapperContained.output); }
// public void output(yarnwrap.client.data.ItemModelOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.client.data.ItemModelOutput output() { return new yarnwrap.client.data.ItemModelOutput(net.minecraft.client.data.ItemModelGenerator.output); }
// public static void output(yarnwrap.client.data.ItemModelOutput value, ) { net.minecraft.client.data.ItemModelGenerator.output = value.wrapperContained; }

public java.util.function.BiConsumer modelCollector() { return wrapperContained.modelCollector; }
// public void modelCollector(java.util.function.BiConsumer value) { wrapperContained.modelCollector = value; }
// public static java.util.function.BiConsumer modelCollector() { return net.minecraft.client.data.ItemModelGenerator.modelCollector; }
// public static void modelCollector(java.util.function.BiConsumer value, ) { net.minecraft.client.data.ItemModelGenerator.modelCollector = value; }

// public yarnwrap.util.Identifier HELMET_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(wrapperContained.HELMET_TRIM_ID_PREFIX); }
// public void HELMET_TRIM_ID_PREFIX(yarnwrap.util.Identifier value) { wrapperContained.HELMET_TRIM_ID_PREFIX = value.wrapperContained; }
public static yarnwrap.util.Identifier HELMET_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.HELMET_TRIM_ID_PREFIX); }
// public static void HELMET_TRIM_ID_PREFIX(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.ItemModelGenerator.HELMET_TRIM_ID_PREFIX = value.wrapperContained; }

// public yarnwrap.util.Identifier CHESTPLATE_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(wrapperContained.CHESTPLATE_TRIM_ID_PREFIX); }
// public void CHESTPLATE_TRIM_ID_PREFIX(yarnwrap.util.Identifier value) { wrapperContained.CHESTPLATE_TRIM_ID_PREFIX = value.wrapperContained; }
public static yarnwrap.util.Identifier CHESTPLATE_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX); }
// public static void CHESTPLATE_TRIM_ID_PREFIX(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX = value.wrapperContained; }

// public yarnwrap.util.Identifier LEGGINGS_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(wrapperContained.LEGGINGS_TRIM_ID_PREFIX); }
// public void LEGGINGS_TRIM_ID_PREFIX(yarnwrap.util.Identifier value) { wrapperContained.LEGGINGS_TRIM_ID_PREFIX = value.wrapperContained; }
public static yarnwrap.util.Identifier LEGGINGS_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX); }
// public static void LEGGINGS_TRIM_ID_PREFIX(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX = value.wrapperContained; }

// public yarnwrap.util.Identifier BOOTS_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(wrapperContained.BOOTS_TRIM_ID_PREFIX); }
// public void BOOTS_TRIM_ID_PREFIX(yarnwrap.util.Identifier value) { wrapperContained.BOOTS_TRIM_ID_PREFIX = value.wrapperContained; }
public static yarnwrap.util.Identifier BOOTS_TRIM_ID_PREFIX() { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.BOOTS_TRIM_ID_PREFIX); }
// public static void BOOTS_TRIM_ID_PREFIX(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.ItemModelGenerator.BOOTS_TRIM_ID_PREFIX = value.wrapperContained; }

public ItemModelGenerator(yarnwrap.client.data.ItemModelOutput output,java.util.function.BiConsumer modelCollector) { this.wrapperContained = new net.minecraft.client.data.ItemModelGenerator(output.wrapperContained,modelCollector); }
public void register() { wrapperContained.register(); }
// public static void register() { net.minecraft.client.data.ItemModelGenerator.register(); }
public void registerClock(yarnwrap.item.Item clock) { wrapperContained.registerClock(clock.wrapperContained); }
// public static void registerClock(yarnwrap.item.Item clock, ) { net.minecraft.client.data.ItemModelGenerator.registerClock(clock.wrapperContained); }
public yarnwrap.util.Identifier uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1) { return new yarnwrap.util.Identifier(wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained)); }
// public static yarnwrap.util.Identifier uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained)); }
public void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2) { wrapperContained.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained); }
// public static void uploadArmor(yarnwrap.util.Identifier id,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2, ) { net.minecraft.client.data.ItemModelGenerator.uploadArmor(id.wrapperContained,layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained); }
public void register(yarnwrap.item.Item item) { wrapperContained.register(item.wrapperContained); }
// public static void register(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.register(item.wrapperContained); }
public void registerDyeable(yarnwrap.item.Item item,int defaultColor) { wrapperContained.registerDyeable(item.wrapperContained,defaultColor); }
// public static void registerDyeable(yarnwrap.item.Item item,int defaultColor, ) { net.minecraft.client.data.ItemModelGenerator.registerDyeable(item.wrapperContained,defaultColor); }
public void registerArmor(yarnwrap.item.Item item,yarnwrap.registry.RegistryKey equipmentKey,yarnwrap.util.Identifier trimIdPrefix,boolean dyeable) { wrapperContained.registerArmor(item.wrapperContained,equipmentKey.wrapperContained,trimIdPrefix.wrapperContained,dyeable); }
// public static void registerArmor(yarnwrap.item.Item item,yarnwrap.registry.RegistryKey equipmentKey,yarnwrap.util.Identifier trimIdPrefix,boolean dyeable, ) { net.minecraft.client.data.ItemModelGenerator.registerArmor(item.wrapperContained,equipmentKey.wrapperContained,trimIdPrefix.wrapperContained,dyeable); }
public void registerPotionTinted(yarnwrap.item.Item item,yarnwrap.util.Identifier model) { wrapperContained.registerPotionTinted(item.wrapperContained,model.wrapperContained); }
// public static void registerPotionTinted(yarnwrap.item.Item item,yarnwrap.util.Identifier model, ) { net.minecraft.client.data.ItemModelGenerator.registerPotionTinted(item.wrapperContained,model.wrapperContained); }
public yarnwrap.util.Identifier uploadTwoLayers(yarnwrap.item.Item item,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1) { return new yarnwrap.util.Identifier(wrapperContained.uploadTwoLayers(item.wrapperContained,layer0.wrapperContained,layer1.wrapperContained)); }
// public static yarnwrap.util.Identifier uploadTwoLayers(yarnwrap.item.Item item,yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.uploadTwoLayers(item.wrapperContained,layer0.wrapperContained,layer1.wrapperContained)); }
public yarnwrap.util.Identifier uploadWithTextureSource(yarnwrap.item.Item item,yarnwrap.item.Item textureSourceItem,yarnwrap.client.data.Model model) { return new yarnwrap.util.Identifier(wrapperContained.uploadWithTextureSource(item.wrapperContained,textureSourceItem.wrapperContained,model.wrapperContained)); }
// public static yarnwrap.util.Identifier uploadWithTextureSource(yarnwrap.item.Item item,yarnwrap.item.Item textureSourceItem,yarnwrap.client.data.Model model, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.uploadWithTextureSource(item.wrapperContained,textureSourceItem.wrapperContained,model.wrapperContained)); }
public void registerWithTintedOverlay(yarnwrap.item.Item item,yarnwrap.client.render.item.tint.TintSource tint) { wrapperContained.registerWithTintedOverlay(item.wrapperContained,tint.wrapperContained); }
// public static void registerWithTintedOverlay(yarnwrap.item.Item item,yarnwrap.client.render.item.tint.TintSource tint, ) { net.minecraft.client.data.ItemModelGenerator.registerWithTintedOverlay(item.wrapperContained,tint.wrapperContained); }
public yarnwrap.util.Identifier upload(yarnwrap.item.Item item,yarnwrap.client.data.Model model) { return new yarnwrap.util.Identifier(wrapperContained.upload(item.wrapperContained,model.wrapperContained)); }
// public static yarnwrap.util.Identifier upload(yarnwrap.item.Item item,yarnwrap.client.data.Model model, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.upload(item.wrapperContained,model.wrapperContained)); }
public yarnwrap.util.Identifier uploadOpenBundleModel(yarnwrap.item.Item item,yarnwrap.client.data.Model model,java.lang.String textureSuffix) { return new yarnwrap.util.Identifier(wrapperContained.uploadOpenBundleModel(item.wrapperContained,model.wrapperContained,textureSuffix)); }
// public static yarnwrap.util.Identifier uploadOpenBundleModel(yarnwrap.item.Item item,yarnwrap.client.data.Model model,java.lang.String textureSuffix, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.uploadOpenBundleModel(item.wrapperContained,model.wrapperContained,textureSuffix)); }
// public void registerCondition(yarnwrap.item.Item item,yarnwrap.client.render.item.property.bool.BooleanProperty property,Object onTrue,Object onFalse) { wrapperContained.registerCondition(item.wrapperContained,property.wrapperContained,onTrue,onFalse); }
// public static void registerCondition(yarnwrap.item.Item item,yarnwrap.client.render.item.property.bool.BooleanProperty property,Object onTrue,Object onFalse, ) { net.minecraft.client.data.ItemModelGenerator.registerCondition(item.wrapperContained,property.wrapperContained,onTrue,onFalse); }
public void registerWithTintedLayer(yarnwrap.item.Item item,java.lang.String layer1Suffix,yarnwrap.client.render.item.tint.TintSource tint) { wrapperContained.registerWithTintedLayer(item.wrapperContained,layer1Suffix,tint.wrapperContained); }
// public static void registerWithTintedLayer(yarnwrap.item.Item item,java.lang.String layer1Suffix,yarnwrap.client.render.item.tint.TintSource tint, ) { net.minecraft.client.data.ItemModelGenerator.registerWithTintedLayer(item.wrapperContained,layer1Suffix,tint.wrapperContained); }
public yarnwrap.util.Identifier registerSubModel(yarnwrap.item.Item item,java.lang.String suffix,yarnwrap.client.data.Model model) { return new yarnwrap.util.Identifier(wrapperContained.registerSubModel(item.wrapperContained,suffix,model.wrapperContained)); }
// public static yarnwrap.util.Identifier registerSubModel(yarnwrap.item.Item item,java.lang.String suffix,yarnwrap.client.data.Model model, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.registerSubModel(item.wrapperContained,suffix,model.wrapperContained)); }
// public Object createModelWithInHandVariant(Object model,Object inHandModel) { return wrapperContained.createModelWithInHandVariant(model,inHandModel); }
// public static Object createModelWithInHandVariant(Object model,Object inHandModel, ) { return net.minecraft.client.data.ItemModelGenerator.createModelWithInHandVariant(model,inHandModel); }
public java.util.List createCompassRangeDispatchEntries(yarnwrap.item.Item item) { return wrapperContained.createCompassRangeDispatchEntries(item.wrapperContained); }
// public static java.util.List createCompassRangeDispatchEntries(yarnwrap.item.Item item, ) { return net.minecraft.client.data.ItemModelGenerator.createCompassRangeDispatchEntries(item.wrapperContained); }
public void registerWithTextureSource(yarnwrap.item.Item item,yarnwrap.item.Item textureSourceItem,yarnwrap.client.data.Model model) { wrapperContained.registerWithTextureSource(item.wrapperContained,textureSourceItem.wrapperContained,model.wrapperContained); }
// public static void registerWithTextureSource(yarnwrap.item.Item item,yarnwrap.item.Item textureSourceItem,yarnwrap.client.data.Model model, ) { net.minecraft.client.data.ItemModelGenerator.registerWithTextureSource(item.wrapperContained,textureSourceItem.wrapperContained,model.wrapperContained); }
public void register(yarnwrap.item.Item item,yarnwrap.client.data.Model model) { wrapperContained.register(item.wrapperContained,model.wrapperContained); }
// public static void register(yarnwrap.item.Item item,yarnwrap.client.data.Model model, ) { net.minecraft.client.data.ItemModelGenerator.register(item.wrapperContained,model.wrapperContained); }
public void registerCompass(yarnwrap.item.Item item) { wrapperContained.registerCompass(item.wrapperContained); }
// public static void registerCompass(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerCompass(item.wrapperContained); }
public void registerRecoveryCompass(yarnwrap.item.Item item) { wrapperContained.registerRecoveryCompass(item.wrapperContained); }
// public static void registerRecoveryCompass(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerRecoveryCompass(item.wrapperContained); }
public void registerBundle(yarnwrap.item.Item item) { wrapperContained.registerBundle(item.wrapperContained); }
// public static void registerBundle(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerBundle(item.wrapperContained); }
public void registerBow(yarnwrap.item.Item item) { wrapperContained.registerBow(item.wrapperContained); }
// public static void registerBow(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerBow(item.wrapperContained); }
public void registerCrossbow(yarnwrap.item.Item item) { wrapperContained.registerCrossbow(item.wrapperContained); }
// public static void registerCrossbow(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerCrossbow(item.wrapperContained); }
public void registerWithBrokenCondition(yarnwrap.item.Item item) { wrapperContained.registerWithBrokenCondition(item.wrapperContained); }
// public static void registerWithBrokenCondition(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerWithBrokenCondition(item.wrapperContained); }
public void registerBrush(yarnwrap.item.Item item) { wrapperContained.registerBrush(item.wrapperContained); }
// public static void registerBrush(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerBrush(item.wrapperContained); }
public void registerFishingRod(yarnwrap.item.Item item) { wrapperContained.registerFishingRod(item.wrapperContained); }
// public static void registerFishingRod(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerFishingRod(item.wrapperContained); }
public void registerGoatHorn(yarnwrap.item.Item item) { wrapperContained.registerGoatHorn(item.wrapperContained); }
// public static void registerGoatHorn(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerGoatHorn(item.wrapperContained); }
public void registerShield(yarnwrap.item.Item item) { wrapperContained.registerShield(item.wrapperContained); }
// public static void registerShield(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerShield(item.wrapperContained); }
public void registerWithInHandModel(yarnwrap.item.Item item) { wrapperContained.registerWithInHandModel(item.wrapperContained); }
// public static void registerWithInHandModel(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerWithInHandModel(item.wrapperContained); }
public void registerTrident(yarnwrap.item.Item item) { wrapperContained.registerTrident(item.wrapperContained); }
// public static void registerTrident(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerTrident(item.wrapperContained); }
public void registerPotion(yarnwrap.item.Item item) { wrapperContained.registerPotion(item.wrapperContained); }
// public static void registerPotion(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerPotion(item.wrapperContained); }
public void registerTippedArrow(yarnwrap.item.Item item) { wrapperContained.registerTippedArrow(item.wrapperContained); }
// public static void registerTippedArrow(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerTippedArrow(item.wrapperContained); }
public void registerWithDyeableOverlay(yarnwrap.item.Item item) { wrapperContained.registerWithDyeableOverlay(item.wrapperContained); }
// public static void registerWithDyeableOverlay(yarnwrap.item.Item item, ) { net.minecraft.client.data.ItemModelGenerator.registerWithDyeableOverlay(item.wrapperContained); }
// public yarnwrap.util.Identifier getTrimAssetIdPrefix(java.lang.String prefix) { return new yarnwrap.util.Identifier(wrapperContained.getTrimAssetIdPrefix(prefix)); }
// public static yarnwrap.util.Identifier getTrimAssetIdPrefix(java.lang.String prefix, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.ItemModelGenerator.getTrimAssetIdPrefix(prefix)); }

}