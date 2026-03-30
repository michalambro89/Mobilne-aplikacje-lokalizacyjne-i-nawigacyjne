package pl.ma.malin.data.mappers

import pl.ma.malin.data.dto.BeaconDto
import pl.ma.malin.domain.model.Beacon

fun BeaconDto.toDomain() = Beacon(
    uid = uid,
    name = name,
    longitude = longitude,
    latitude = latitude,
    floorId = floorId
)