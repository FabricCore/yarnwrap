package yarnwrap.item;
public class AnimalArmorItem { public net.minecraft.item.AnimalArmorItem wrapperContained; public AnimalArmorItem(net.minecraft.item.AnimalArmorItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier entityTexture() { return new yarnwrap.util.Identifier(wrapperContained.entityTexture); }
// public void entityTexture(yarnwrap.util.Identifier value) { wrapperContained.entityTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier entityTexture() { return new yarnwrap.util.Identifier(net.minecraft.item.AnimalArmorItem.entityTexture); }
// public static void entityTexture(yarnwrap.util.Identifier value, ) { net.minecraft.item.AnimalArmorItem.entityTexture = value.wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.item.AnimalArmorItem.type; }
// // public static void type(Object value, ) { net.minecraft.item.AnimalArmorItem.type = value; }

// public yarnwrap.util.Identifier overlayTexture() { return new yarnwrap.util.Identifier(wrapperContained.overlayTexture); }
// public void overlayTexture(yarnwrap.util.Identifier value) { wrapperContained.overlayTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier overlayTexture() { return new yarnwrap.util.Identifier(net.minecraft.item.AnimalArmorItem.overlayTexture); }
// public static void overlayTexture(yarnwrap.util.Identifier value, ) { net.minecraft.item.AnimalArmorItem.overlayTexture = value.wrapperContained; }

// public AnimalArmorItem(yarnwrap.registry.entry.RegistryEntry material,Object type,boolean hasOverlay,Object settings) { this.wrapperContained = new net.minecraft.item.AnimalArmorItem(material.wrapperContained,type,hasOverlay,settings); }
public yarnwrap.util.Identifier getEntityTexture() { return new yarnwrap.util.Identifier(wrapperContained.getEntityTexture()); }
// public static yarnwrap.util.Identifier getEntityTexture() { return new yarnwrap.util.Identifier(net.minecraft.item.AnimalArmorItem.getEntityTexture()); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.item.AnimalArmorItem.getType(); }
public yarnwrap.util.Identifier getOverlayTexture() { return new yarnwrap.util.Identifier(wrapperContained.getOverlayTexture()); }
// public static yarnwrap.util.Identifier getOverlayTexture() { return new yarnwrap.util.Identifier(net.minecraft.item.AnimalArmorItem.getOverlayTexture()); }

}