package com.meetmywagon23.projectrpg.armormaterials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;

public interface WagonsArmorMaterial extends ArmorMaterial {

    public double getWagonsProtectionAmount(EquipmentSlot slot);
}
