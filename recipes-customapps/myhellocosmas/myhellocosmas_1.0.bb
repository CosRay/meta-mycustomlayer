#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "customapplications"
DEPENDS = ""
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file:///poky/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "https://github.com/CosRay/myhellocosmas.git"
SRCREV = "$AUTOREV"

SRC_URI[md5sum] = "60adc019e1ab8f47b1c24c49b1ff3c1f"
SRC_URI[sha256sum] = "a7a6823298eb4b5ed98a7daea83073ce319fc9ebb7bea327f151d3b8ceed801f"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

