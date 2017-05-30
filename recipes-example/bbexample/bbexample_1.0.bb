#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "31c63ba470375ac7a77b9e3274184a013c2c9931"
SRC_URI = "git://github.com/zeeblex/bbexample.git"

S = "${WORKDIR}/git"

inherit autotools
PARALLEL_MAKE = ""
