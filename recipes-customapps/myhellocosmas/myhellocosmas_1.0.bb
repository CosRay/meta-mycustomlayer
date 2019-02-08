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

SRC_URI[md5sum] = "c4c74055c0d42ddaf3a7bc4d3144ffd0"
SRC_URI[sha256sum] = "30e867bba27f159cbe7c032cbf1390e8fc9efa68e8909e20ca2623348c7f6b6c"

SRC_URI = "https://github.com/CosRay/meta-mycustomlayer.git"
SRCREV = "$AUTOREV"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

