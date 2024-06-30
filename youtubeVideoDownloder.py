""" step1: In your computer/laptop terminal "import pytube module usin pip install pytube" to run this module"""

from pytube import YouTube
YouTube('#past the youtube link here').streams.first().download()
