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

#SRC_URI = "https://github.com/CosRay/myhellocosmas.git"
#SRCREV = "$AUTOREV"

SRCREV = "5c58a861ca31710f6433487b8b0d590a43afd0ad"
SRC_URI = "git://github.com/DynamicDevices/bbexample.git"

S = "${WORKDIR}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

