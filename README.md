# AudioConverter for Android
Convert a WAV to M4A audio file using MediaMuxer

While working on an audio app I was checking out how to convert a WAV file to MP3. There's lame and FFMPEG (which seems to use lame). Some repo's are available as a FFMPEG wrapper but using that lib adds 12+ MB to your apps size. I figured that was to much for just converting a WAV to an MP3. You can always pick the lame solution though..

Since I didn't like both those options I looked into some other options to compress an WAV file to a acceptable format. That's where I ended up with converting a WAV to an M4A (It's an MP4 with just audio).

# Usage
```
repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  implementation 'com.github.renezuidhof:AudioConverter:1.0.0'
}
```

# Example usage

```
val samplerate = 44100
val numberOfChannels = 2
val M4ABitRate = 64000

val wavToM4AConverter = WavToM4AConverter(samplerate, numberOfChannels, M4ABitRate)

val wavFile = File(<some path>/my_existing_wav_file.wav)
val destinationM4AFile = File(<some path>/my_new_compressed_audio_file.m4a")
val result = wavToM4AConverter.convert(wavFile, destinationM4AFile)
```
