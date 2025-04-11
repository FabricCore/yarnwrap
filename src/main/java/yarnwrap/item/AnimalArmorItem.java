package yarnwrap.item;
public class AnimalArmorItem { public net.minecraft.item.AnimalArmorItem wrapperContained; public AnimalArmorItem(net.minecraft.item.AnimalArmorItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier entityTexture() { return new yarnwrap.util.Identifier(wrapperContained.entityTexture); }
// public void entityTexture(yarnwrap.util.Identifier value) { wrapperContained.entityTexture = value.wrapperContained; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public yarnwrap.util.Identifier overlayTexture() { return new yarnwrap.util.Identifier(wrapperContained.overlayTexture); }
// public void overlayTexture(yarnwrap.util.Identifier value) { wrapperContained.overlayTexture = value.wrapperContained; }
public yarnwrap.util.Identifier getEntityTexture() { return new yarnwrap.util.Identifier(wrapperContained.getEntityTexture()); }
public Object getType() { return wrapperContained.getType(); }
public yarnwrap.util.Identifier getOverlayTexture() { return new yarnwrap.util.Identifier(wrapperContained.getOverlayTexture()); }

}