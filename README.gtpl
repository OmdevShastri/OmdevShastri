<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=OmdevShastri&show_icons=true&theme=tokyonight" />
</a></p>

<p align="center"><a href="https://wakatime.com/@omdevs">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@omdevs/2103d59c-1452-4488-8839-2bc38ce2b54e.svg" />
</a>
<a href="https://wakatime.com/@omdevs">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@omdevs/a25b64df-1da2-4911-9ba1-8a03b96e8e19.svg" />
</a></p>

<p align="center"><a href="https://wakatime.com/@omdevs">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@omdevs/f29c261d-7381-41f5-a6b7-d66c98eccacc.svg" />
</a>
<a href="https://wakatime.com/@omdevs">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@omdevs/ef66e39c-edc7-4b2b-9386-29b4389a3d85.svg" />
</a></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://christitus.com/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Youtube   : <https://youtube.com/c/ChrisTitusTech>
  - Twitch    : <https://twitch.tv/christitustech>
  - Twitter   : <https://twitter.com/christitustech>
  - Website   : <https://christitus.com>
  - Web Store : <https://cttstore.com>
