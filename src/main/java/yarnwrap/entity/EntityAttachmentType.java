package yarnwrap.entity;
public class EntityAttachmentType { public net.minecraft.entity.EntityAttachmentType wrapperContained; public EntityAttachmentType(net.minecraft.entity.EntityAttachmentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object point() { return wrapperContained.point; }
// // public void point(Object value) { wrapperContained.point = value; }
public java.util.List createPoint(float width,float height) { return wrapperContained.createPoint(width,height); }

}