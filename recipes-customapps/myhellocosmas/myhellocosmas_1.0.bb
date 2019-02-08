#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "customapplications"
DEPENDS = ""
LICENSE = "COPYING.MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "04a1c3aabad2fbb1c4ba3619ff741c3f8c146731;protocol=ssh"
SRC_URI = "git://github.com/CosRay/myhellocosmas.git"


S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

