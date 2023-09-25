package com.meetmywagon23.projectrpg.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.meetmywagon23.projectrpg.armormaterials.WagonsArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;

import java.util.UUID;

public class DragonScaleArmorItem extends ArmorItem {
    private static final UUID[] MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public DragonScaleArmorItem(WagonsArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
        this.protection = material.getWagonsProtectionAmount(slot);
        this.toughness = material.getToughness();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uUID, "Armor modifier", (double)this.protection, EntityAttributeModifier.Operation.ADDITION));
        if (material.getToughness() >0){
            builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uUID, "Armor toughness", (double)this.toughness, EntityAttributeModifier.Operation.ADDITION));
        }
        if (material.getKnockbackResistance() >0) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uUID, "Armor knockback resistance", (double)this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));
        }
        this.wagonsAttributeModifiers = builder.build();
    }
    private final Multimap<EntityAttribute, EntityAttributeModifier> wagonsAttributeModifiers;
    private final double protection;
    private final float toughness;
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.slot ? this.wagonsAttributeModifiers : super.getAttributeModifiers(slot);
    }
    public int getProtection() {
        return (int)this.protection;
    }
    public float getToughness() {
        return this.toughness;
    }

}
